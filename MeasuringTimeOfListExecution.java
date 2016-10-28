import java.util.*;

/**
 * Created by admin on 28.10.16.
 */
public class MeasuringTimeOfListExecution {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();

        Date dateBegin = new Date();
        insert10000(list);
        Date dateEnd = new Date();
        System.out.println("ADD Int: " + (dateEnd.getTime()-dateBegin.getTime()) + " ms");

        Date dateBegin2 = new Date();
        insert10000(list1);
        Date dateEnd2 = new Date();
        System.out.println("ADD Str: " + (dateEnd2.getTime()-dateBegin2.getTime()) + " ms");
        System.out.println("--------------------");

        Date dateBegin1 = new Date();
        get10000(list);
        Date dateEnd1 = new Date();
        System.out.println("GET Int: " + (dateEnd1.getTime()-dateBegin1.getTime()) + " ms");

        Date dateBegin4 = new Date();
        get10000(list1);
        Date dateEnd4 = new Date();
        System.out.println("GET Str: " + (dateEnd4.getTime()-dateBegin4.getTime()) + " ms");
        System.out.println("--------------------");

        Date dateBegin3 = new Date();
        set10000(list);
        Date dateEnd3 = new Date();
        System.out.println("SET Int: " + (dateEnd3.getTime()-dateBegin3.getTime()) + " ms");

        Date dateBegin5 = new Date();
        set10000(list1);
        Date dateEnd5 = new Date();
        System.out.println("SET Str: " + (dateEnd5.getTime()-dateBegin5.getTime()) + " ms");
        System.out.println("--------------------");

        Date dateBegin6 = new Date();
        remove10000(list);
        Date dateEnd6 = new Date();
        System.out.println("REM Int: " + (dateEnd6.getTime()-dateBegin6.getTime()) + " ms");

        Date dateBegin7 = new Date();
        remove10000(list1);
        Date dateEnd7 = new Date();
        System.out.println("REM Str: " + (dateEnd7.getTime()-dateBegin7.getTime()) + " ms");
        System.out.println("--------------------");

    }

    public static void insert10000(List list){

        for (int i = 0; i < 500_000; i++) {
            list.add(new Object());
        }

    }

    public static void get10000(List list){

        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }

    }

    public static void set10000(List list){

        for (int i = 0; i < list.size(); i++) {
            list.set(i, new Object());
        }

    }

    public static void remove10000(List list){

        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }
    }
}
