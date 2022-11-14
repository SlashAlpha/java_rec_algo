package slash.code;

public class Hanoï {


    public void tower(int cercles,char from,char to,char aux ){
        if(cercles==1){
            System.out.println("Moving the disc " +1+" from "+from+" to "+to+" rod");
        }else{
        tower(cercles-1,from,aux,to);
        System.out.println("Moving the disc " +cercles+" from "+from+" to "+to+" rod");
        tower(cercles-1,aux,to,from);}
    }
}
