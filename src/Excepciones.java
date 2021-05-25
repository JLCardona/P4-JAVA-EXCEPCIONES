public class Excepciones extends Exception{
    private int codigoError;

    public Excepciones(int codigoError) {
        super();
        this.codigoError = codigoError;
    }

    @Override
    public String getMessage() {
        String mensaje="";
        switch (codigoError){
            case 1 :
                mensaje ="¡ERROR! ¿Como puedes tener 0 años o menos?";
                break;
            case 2 :
                mensaje="¡ERROR! Es obligatorio introducir un nombre.";
                break;
            case 3 :
                mensaje="¡ERROR! Es obligatorio introducir tu 1er apellido.";
                break;
            case 4 :
                mensaje="¡ERROR! Es obligatorio introducir tu 2o apellido.";
                break;
        }
        return mensaje;
    }
}
