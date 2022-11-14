package slash.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayProductSum {

    public int prodSum(ArrayList list,int depth){
     int   productSum=0;

        for(int i=0;i<list.size()-1;i++){

            if (list.get(i)==int.class.arrayType()){
                prodSum((ArrayList) list.get(i),depth+1);

        }
            else {productSum+=(Integer)list.get(i)*depth;}


        }
        return productSum;

    }
    
    public int prodSumObj(List<Object> list,int depth){
        int productSum=0;
        for (Object object:list
             ) {
            if (object instanceof List){
               productSum+= prodSumObj((List<Object>)object,depth+1);
            }
            else {productSum+=(Integer)object;}
            
        }
        return productSum*depth;
    }
}
