package st;
public class hello{
     /**
      *<p><p/>
      *이것은 Hello World 를 
      *출력해주는 메인 메소드입니다.
      *
      *
      *
      */
    public static void main(String args[]){
     System.out.println("Hello World");
    }
   /**
    *<p><p/>
    *이것은 sum 메소드 입니다.
    *
    *@param x 입력 x 값
    *@param y 입력 y 값
    *
    *@return x와 y의 합<br>
    *<p> >>> 예제 : 다음 처럼 쓰시오 int result = sum(x,y) </P>
    */
   public void sum(int x,int y){
   int sum = 0;
   sum = x + y;
   return sum;
   }
}


/**
* <p><p/>
* <STRONG>data 클래스 입니다.</STRONG>
* <p> >>> 생성자로써 x,y의 입력이 필수적입니다. <p/>
*
*/
public class data{
int x;
int y;
 
data(int x, int y){
this.x = x;
this.y = y;
}
}

