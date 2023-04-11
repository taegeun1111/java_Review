package day12.lambda;

//가벼운 사과만 검사하는 클래스
public class LightApplePredicate implements ApplePredicate{

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight()<=100;
    }
}
