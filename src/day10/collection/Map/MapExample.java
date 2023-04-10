package day10.collection.Map;

import day07.util.Utility;
import day09.quiz2.Artist;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<>();

        /**
         * put(K,V) : 데이터 추가
         */
        map.put("지갑잔액",40000);
        map.put("좋아하는 가수",new Artist("동방신기",null));
        map.put("저녁메뉴","볶음밥");

        System.out.println(map.size());

        /**
         * get(key) : 데이터 참조
         */
        String dinner = (String)map.get("저녁메뉴");
        System.out.println("dinner = " + dinner);
        String s = dinner.toUpperCase();
        System.out.println("s = " + s);

        Artist artist = (Artist)map.get("좋아하는 가수");
        artist.info();

        Utility.makeLine();
        System.out.println(map);

        //이미 존재하는 키를 추가하면 수정이 된다.
        map.put("저녁메뉴", "짬뽕");
        map.put("아침메뉴","샌드위치");
        System.out.println("map = " + map);

        /**
         * 반복문 처리
         */
        //Map은 iterable이 없어서 foreach가 안된다.
        //cmd Map으로 확인가능
        //map.KeySet()은 String을 반환하기 때문에 foreach가능
        //for(Object test : map){}
        for(String key : map.keySet()){
            System.out.println("key = " + key);
            System.out.println("value = "+ map.get(key));
            Utility.makeLine();
        }







    }
}
