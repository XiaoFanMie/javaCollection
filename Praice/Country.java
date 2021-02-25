package Praice;

import java.util.LinkedList;
import java.util.Random;

public class Country {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("科特迪瓦");
        linkedList.add("阿根廷");
        linkedList.add("澳大利亚");
        linkedList.add("塞尔维亚");
        linkedList.add("荷兰");
        linkedList.add("尼日利亚");
        linkedList.add("日本");
        linkedList.add("美国");
        linkedList.add("中国");
        linkedList.add("新西兰");
        linkedList.add("巴西");
        linkedList.add("比利时");
        linkedList.add("韩国");
        linkedList.add("柯麦伦");
        linkedList.add("洪都拉斯");
        linkedList.add("意大利");
        Random random = new Random();
        String b ;
        for (int i = 1; i < 5; i++) {
            System.out.println("第"+i+"组");
            for (int j = 0; j < 4; j++) {
                b=linkedList.get(random.nextInt(linkedList.size()));
                System.out.print(b+"\t");
                linkedList.remove(b);
            }
            System.out.println();
        }
    }

}
