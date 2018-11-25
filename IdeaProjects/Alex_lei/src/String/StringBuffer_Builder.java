package String;

/**
 * @Author:Alex_lei
 * @Description: Test (String,StringBuilder,StringBuffer) speed
 */
public class StringBuffer_Builder {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String str = "";
        for(int i=0;i<10000;i++){
            str=str+"a";
        }
        long stop = System.currentTimeMillis();
        System.out.println(stop-start);
        start = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<10000;i++){
            stringBuilder.append("a");
        }
        stop = System.currentTimeMillis();
        System.out.println(stop-start);
        start = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for(int i=0;i<10000;i++){
            stringBuffer.append("a");
        }
        stop = System.currentTimeMillis();
        System.out.println(stop-start);

    }
}
