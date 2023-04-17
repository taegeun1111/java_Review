package test;

import day07.util.Utility;
import day13.Student;

import java.util.ArrayList;
import java.util.List;

import static day07.util.Utility.*;

public class test {
    List<espresso> espressosList = new ArrayList<>(
            List.of(
                    new espresso("아메리카노", 2000),
                    new espresso("아인슈패너", 3000),
                    new espresso("에스프레소", 4000),
                    new espresso("꿀커피", 5000)
            )
    );
    List<latte> latteList = new ArrayList<>(
            List.of(
                    new latte("카페라떼", 2000),
                    new latte("녹차라떼", 3000),
                    new latte("곡물라떼", 4000),
                    new latte("토피넛라떼", 5000)
            )
    );

    public static void main(String[] args) {

    }


    public void addMenu() {
        System.out.println("[1.에스프레소],[2.라떼]");
        String inputCategory = input("카테고리를 선택해주세요 : ");
        orderMenu(inputCategory);
    }

    private void orderMenu(String input) {
        int espressoOrderPrice = 0;
        int latteOrderPrice = 0;

        switch (input) {
            case "1":
                System.out.println(espressosList);
                String espressoInput = input("주문하실 메뉴를 입력해주세요!");
                boolean inputCompare = espressosList.stream()
                        .anyMatch(es -> es.getName().equals(espressoInput));
                if (inputCompare) {
                    String inputHot = input("[핫/아이스]");
                    String inputOption = input("옵션:[샷추가]를 하시시겠습니까?[Y/N]");
                    if (inputOption.toUpperCase().equals("Y")) {
                        //해당 메뉴를 찾아서 500원 추가
                        for (int i = 0; i < espressosList.size(); i++) {
                            if (espressosList.get(i).getName().equals(espressoInput)) {
                                espressosList.get(i).setPrice(espressosList.get(i).getPrice() + 500);
                                //장바구니에 추가 => 장바구니 객체에 set해주기
                                //수량은 최종 객체의 size나 length로 출력
                                espressoOrderPrice += espressosList.get(i).getPrice();
                            }
                        }
                        //주문 완료 -> 장바구니에 추가해주기
                    } else if (inputOption.toUpperCase().equals("N")) {
                        //주문 완료 -> 장바구니에 추가해주기

                    }
                    System.out.printf("%s %s가 성공적으로 주문되었습니다.", inputHot, espressoInput);
                    String goCart = input("1.계속 주문하시겠습니까? 2.장바구니로 가시겠습니까?");
                    //1번 누르면 초기화면, 2번 누르면 장바구니

                    //장바구니 추가
                } else {
                    System.out.println("일치하는 메뉴명이 없습니다. 다시 입력해주세요!");
                }

                break;
            case "2":
                System.out.println(latteList);
                break;
            default:
                System.out.println("잘못된 번호를 입력했습니다. 다시 입력해주세요");
        }
    }


    public class categoryType {
    }
}
