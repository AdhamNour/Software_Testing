public class Maxofthree {
    public Integer maxOf3(int a , int b, int c){
        if(a > 200 || a < 0 || b > 200 || b < 0 || c > 200 || c < 0) return  null;
        if(a>b){
            if(a>c) return a;
            else return c;
        }
        else{
            if(b>c) return b;
            else return c;
        }

    }
}
