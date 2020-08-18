import javax.swing.JOptionPane;
public class Ejercicio03{
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null,"Programa que calcula el sueldo de un empleado");
        String empleado;
        int matricula,tipoe = 0,diast,retardos,horasextra,importe=0,bono=0,descuento=0,sueldo=0;
        double sueldoiva=0,iva=1.11;
       
        diast = Integer.parseInt(JOptionPane.showInputDialog("Dias Trabajados:"));
        retardos = Integer.parseInt(JOptionPane.showInputDialog("Retardos:"));
        horasextra = Integer.parseInt(JOptionPane.showInputDialog("Horas extras:"));
        if(tipoe==1){
            importe=350*diast;
        }
        if(tipoe==2){
            importe=250*diast;
        }
        if(tipoe==3){
            importe=125*diast;
        }
        if(horasextra>=1 && horasextra<=5){
            bono=horasextra*100;
        }
        if(horasextra>=6 && horasextra<=10){
            bono=500+((horasextra-5)*150);
        }
        if(horasextra>=11 && horasextra<=15){
            bono=1250+((horasextra-10)*275);
        }
        if(retardos>=1 && retardos<=5){
            descuento=retardos*50;
        }
        if(retardos>=6 && retardos<=10){
            descuento=250+((retardos-5)*75);
        }
        if(retardos>=11 && retardos<=15){
            descuento=625+((retardos-10)*100);
        }
        sueldo=(importe+bono)-descuento;
        sueldoiva=sueldo*iva;
        String imprimir="";
       
        imprimir=imprimir+("Tipo de Empleado:"+tipoe+"\n");
        imprimir=imprimir+("Dias Trabajados:"+diast+"\n");
        imprimir=imprimir+("Retardos:"+retardos+"\n");
        imprimir=imprimir+("Horas Extras:"+horasextra+"\n");
        imprimir=imprimir+("Importe:"+importe+"\n");
        imprimir=imprimir+("Bono:"+bono+"\n");
        imprimir=imprimir+("Descuento:"+descuento+"\n");
        imprimir=imprimir+("Sueldo:"+sueldo+"\n");
        imprimir=imprimir+("Sueldo con IVA:"+sueldoiva+"\n");
        JOptionPane.showMessageDialog(null, imprimir," Nomina: ",1);
    }
}
