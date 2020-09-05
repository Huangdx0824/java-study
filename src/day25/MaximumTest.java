package day25;

/**
 * 实例
 * 下面的例子演示了"extends"如何使用在一般意义上的意思"extends"（类）或者"implements"（接口）。该例子中的泛型方法返回三个可比较对象的最大值
 */
public class MaximumTest {

    //比较三个值并返回最大值
    public static <T extends Comparable<T>>T maximum(T x,T y, T z){
        T max = x;
        if (y.compareTo(max) > 0){
            max = y; // y更大
        }
        if ( z.compareTo(max) > 0){
            max = z; //现在z更大
        }
        return max; // 返回最大对象
    }

    public static void main(String[] args) {
        System.out.printf("%d, %d, %d中最大的数为 %d\n\n ",
                3, 4, 5, maximum(3,4,5));

        System.out.printf("%.1f, %.1f, %.1f 中最大的数为 %.1f\n\n",
                6.6, 8.8, 7.7, maximum( 6.6, 8.8, 7.7 ) );

        System.out.printf("%s, %s, %s 中最大的数为 %s\n",
                "pear", "apple", "orange", maximum( "pear", "apple", "orange" ) );
    }
}
