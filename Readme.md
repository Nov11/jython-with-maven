### play with jython

#### call python scripts located in resource directory

Variable named '__pyclasspath__' means the path which contains files resided in resources folder.

Before use python scripts, add library paths to `__pyclasspath__` so that jython can find them.

Pip support : In case you wanna store python dependencies in resource folder, run ```pip install --install-option="--prefix=PATH_TO_RESOURCE_FOLDER" package_name --ignore-installed ```
[stack overflow link](https://stackoverflow.com/questions/2915471/install-a-python-package-into-a-different-directory-using-pip). A folder named Lib will be created.
And in Lib/python2.7/site-packages folder you can find all your python packages. In order to use them, add this to sys.path : `__pyclasspath__/Lib/python2.7/site-packages`.

Jython doesn't support python scripts with C extensions. So only pure python packages can be invoke in this way.