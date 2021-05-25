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
                mensaje="¡ERROR! 2";
                break;
        }
        return mensaje;
    }
}
