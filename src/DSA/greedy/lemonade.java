package DSA.greedy;

public class lemonade {
    public boolean lemonadeChange(int[] bills) {
        int f = 0;
        int t = 0;
        for(int  x : bills ){
            if(x==5) f++;
            else{
                if(f==0) return false ;
                if(x==10){
                    t++;
                    f-- ;
                }
                else{
                    if(t>0){
                        t--;
                        f--;
                    }
                    else {
                        if(f>=3){
                            f = f- 3;
                        }
                        else return false ;
                    }
                }
            }
        }
        return true ;
    }
}
