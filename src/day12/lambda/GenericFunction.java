package day12.lambda;

public interface GenericFunction <X,Y>{
    //x를 주면 y를 리턴
    Y apply (X x);
}
