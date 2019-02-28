package pkg;

import org.python.util.PythonInterpreter;

public class CallPythonScripts {

    public static void main(String[] args) {
        PythonInterpreter interp = new PythonInterpreter();

        // add library search path to get module 'foo'
        interp.exec("import sys");
        interp.exec("sys.path.append('__pyclasspath__/Lib')");

        interp.exec("print sys.path");

        interp.exec("from foo import printer");
        interp.exec("printer.print_foo()");
    }
}
