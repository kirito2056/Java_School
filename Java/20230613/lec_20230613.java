import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;

public class lec_20230613 {
    BufferedReader in;
    HashSet<PhotoCard_Class> mArray = new HashSet<>();
    String[] _tempStr = {"가나다", "달봉이", "김달봉", "홍길동"};

    public static void main(String args[]) throws IOException{
        lec_20230613 _main = new lec_20230613();
        _main.processMethod();
    }

    private void processMethod() throws IOException {
        init_Data();
        boolean _isFinish = false;
        while (!_isFinish) {
            _isFinish = printMenu();
        }
    }

    private void init_Data() {
        for ( int _pos = 0 ; _pos < _tempStr.length ; _pos++) {
            PhotoCard_Class _temp = new PhotoCard_Class();
            _temp.name = _tempStr[_pos];
            _temp.price = (int)(Math.random() * 10000) + 1000;
            //mArray[_pos] = _temp;
        }
        in = new BufferedReader(new InputStreamReader(System.in));
    }


    private boolean printMenu()throws IOException {
        System.out.println("메뉴를 선택하세요");
        System.out.println("1, 입력");
        System.out.println("2. 출력");
        System.out.println("3. 검색");
        System.out.println("4. 삭제");
        System.out.println("9. 종료");
        System.out.print("메뉴 선택 : ");
        String _menu = in.readLine();
        if ( _menu.equals("1")) insertCard();
        else if ( _menu.equals("2")) printInfo();
        else if ( _menu.equals("3")) searchName();
        else if ( _menu.equals("4")) deleteName();
        else if ( _menu.equals("9")) return true;
        return false;
    }

    private void deleteName() {
    }

    private void searchName() throws IOException{
        System.out.println("검색할 내용 입력");
        String _name = in.readLine();
        boolean _isSearch = false;
        Iterator<PhotoCard_Class> _it = mArray.iterator();
        while (_it.hasNext() ) {
            PhotoCard_Class _temp = _it.next();
            if ( _temp.name.contains( _name )) {
                System.out.println("이름 : " + _temp.name + "가격 : " + _temp.price);
            }
        }

    }


    private static void processExit() {
    }

    private static void printInfo() {
    }

    private void insertCard() throws IOException{
        PhotoCard_Class _temp = new PhotoCard_Class();
        System.out.print("이름 입력: ");
        _temp.name = in.readLine();

        System.out.print("가격 입력: ");
        _temp.price = Integer.parseInt(in.readLine());
/*
        for ( int _pos = 0 ; _pos < mArray.size() ; _pos++) {
            if ( mArray[_pos] == null) {
                mArray[_pos] = _temp;
                break;
            }
        }
 */
    }

}
