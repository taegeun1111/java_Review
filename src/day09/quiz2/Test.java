package day09.quiz2;


import day04.Array.StringList;

public class Test {

    public static void main(String[] args) {

        // 가수 객체 생성
        ArtistRepository ar = new ArtistRepository();
        Artist artist = new Artist();
        ar.addNewArtist("아이유","분홍신");
        ar.addNewArtist("동방신기","미로틱");
        artist.info();
        Artist foundArtist = ar.findArtistByName("동방신기");
        System.out.println(foundArtist);


    }
}
