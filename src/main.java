public class main {

    public static  void main(String args[]){
        //Objeto Cliente
        Cliente cli=new Cliente();
        cli.setEdad(21);
        cli.setTelefono("0989387197");
        cli.setNombre("Gabriel");
        cli.setCredito(3500.95);
        //Objeto Trabajador
        Trabajador tra=new Trabajador();
        tra.setEdad(30);
        tra.setTelefono("0989387194");
        tra.setNombre("Misael");
        tra.setSalario(2750.25);
        //Presentando datos de Cliente
        System.out.println(cli.toString());
        //Presentando datos de trabajador
        System.out.println(tra.toString());
    }
}
