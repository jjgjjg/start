package st1;

public class bye{

public static void main(String args[]){

Scanner in = new Scanner(System.in);
int x = in.nextInt();
int y = in.nextInt();

int result = multiply(x,y);
System.out.println(result);
int result = minus(x,y);
System.out.println(result);
float resulting = devide((float)x,(float)y);
System.out.println(resulting);

}
/** <p><p/> 
* devide 메소드
* @param x 실수 x 
* @param y 실수 y
* @return x 를 y 로 나눈 값 
* <p> >>> 예: float result = devdie(x,y) <p/>
*/
public static float devide(float x, float y){

float result = x / y;
return result;

}
/** <p><p/>
* minus 메소드
* @param x 정수 x
* @param y 정수 y
* @return x 에서 y를 뺀 값
* <p> >>> 예: int result = minus(x,y)
*/
public static int minus(int x, int y){
int result = x - y;
return result;
}
/** <p><p/>
* multiply 메소드
* @param x 정수 x
* @param y 정수 y
* @return x 와 y를 곱한 값
* <p> >>> 예: int result = multiply(x,y) <p/>
*/
public static int multply(int x, int y){
int result = x * y;
return result;
}





}
