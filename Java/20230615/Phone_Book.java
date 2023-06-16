import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Phone_Book {
    BufferedReader bufferedReader;
    ArrayList<Address> address = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Phone_Book phone_book = new Phone_Book();
        phone_book.processMethod();
    }

    private void processMethod() throws IOException {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean play_PhoneBook = true;
        do {
            play_PhoneBook = print_Menu();
        } while (play_PhoneBook);
    }



    private boolean print_Menu()  throws IOException {
        boolean play_PhoneBook;
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        System.out.println("|1. 전화번호를 저장한다\t|");
        System.out.println("|2. 전화번호 목록을 출력한다|");
        System.out.println("|3. 전화번호를 검색한다\t|");
        System.out.println("|4. 전화번호를 삭제한다\t|");
        System.out.println("|5. 프로그램을 종료한다\t|");
        System.out.println("|6. 사용법을 출력한다\t\t|");
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        int number = Integer.parseInt(bufferedReader.readLine());

        if ( number == 1) save_Phone();
        else if ( number == 2) list_Phone();
        else if ( number == 3) find_Phone();
        else if ( number == 4) delete_Phone();
        else if ( number == 5) {
            boolean down_yn = down_Program();
            if (down_yn == true) return false;
        } else if ( number == 6) print_Seolmyeongseo();
        else System.out.println("메뉴에 있는 숫자를 입력해주세요");

        return true;
    }
    public void save_Phone() throws IOException {
        System.out.print("저장할 이름을 입력하세요: ");
        String name = bufferedReader.readLine();
        System.out.print("전화번호를 입력하세요: ");
        String phoneNumber = bufferedReader.readLine();
        address.add(new Address(name, phoneNumber));
        System.out.println("저장되었습니다!");
    }

    public void list_Phone() {
        if (address.size() <= 0) System.out.println("등록된 연락처가 없습니다");
        else System.out.println("등록된 연락처의 갯수는 "+ address.size() + "입니다");
        for ( int i = 0 ; i < address.size() ; i++) {
            String name = address.get(i).getName();
            String phoneNumber = address.get(i).getPhoneNumber();
            System.out.println(name + " - " +  phoneNumber);
        }
    }

    public void find_Phone() throws IOException {
        System.out.println("검색할 이름을 입력하세요 : ");
        String searchName = bufferedReader.readLine();
        int found_Phone = 0;
        for ( int i = 0 ; i < address.size() ; i++) {
            if ( searchName.equals(address.get(i).getName())) {
                System.out.println( address.get(i).getName() +
                        " : " + address.get(i).getPhoneNumber());
                found_Phone++;
            }
        }
        if ( found_Phone == 0) System.out.println("지금 검색하신 이름은 검색되지 않았습니다");
    }

    public void delete_Phone() throws IOException {
        if ( address.size() <= 0) System.out.println("등록된 연락처가 없습니다");
        else {
            for (int i = 0; i < address.size(); i++) {
                System.out.println((i + 1) + " : " + address.get(i).getName() + " : " + address.get(i).getPhoneNumber());
            }
            System.out.println("삭제할 전화번호를 선택하세요: ");
            int selected_num = Integer.parseInt(bufferedReader.readLine());

            if (selected_num > address.size()) System.out.println("없는 전화번호를 선택하셨습니다");
            else {
                address.remove(selected_num - 1);
                System.out.println("삭제가 완료되었습니다");
            }
        }
    }

    public boolean down_Program() throws IOException {
        System.out.println("해당 프로그램이 종료되면 저장된 전화번호가 모두 사라집니다");
        System.out.println("프로그램을 종료하시겠습니까? ( Y / N )");

        do {
            String down_yn = bufferedReader.readLine();
            if ("Y".equals(down_yn) || "y".equals(down_yn)) return true;
            else if ("N".equals(down_yn) || "n".equals(down_yn)) return false;
            else System.out.println("Y 또는 N을 입력해주세요");
        } while(true);
    }

    public void print_Seolmyeongseo() {
        System.out.println("1번은 전화번호를 저장합니다.");
        System.out.println("이름을 작성하고 enter키를 누르고");
        System.out.println("전화번호를 작성하고 enter키를 누르면");
        System.out.println("전화번호가 저장됩니다");
        System.out.println();
        System.out.println("2번은 전화번호 목록을 출력하는 기능을 합니다.");
        System.out.println("전화번호에 저장되어있는 전화번호의 갯수와");
        System.out.println("이름, 전화번호를 모두 출력합니다.");
        System.out.println();
        System.out.println("3번은 전화번호를 검색하는 기능을 합니다.");
        System.out.println("\"정확한\" 이름을 작성하고 enter키를 누르면");
        System.out.println("검색한 이름인 사람들의 이름과 전화번호가 출력됩니다,");
        System.out.println();
        System.out.println("4번은 전화번호를 삭제하는 기능을 합니다.");
        System.out.println("저장한 순서대로 나오는 전화번호중");
        System.out.println("삭제할 전화번호의 번호를 입력하면 전화번호가 삭제됩니다.");
        System.out.println();
        System.out.println("5번은 프로그램을 종료하는 기능을 합니다");
        System.out.println("해당 프로그램이 종료되면 저장된 전화번호가 모두 삭제되니 주의해주세요");
    }


    public class Address {
        private final String name;
        private final String phoneNumber;
        public Address(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        public String getName () {
            return name;
        }
        public String getPhoneNumber() {
            return phoneNumber;
        }
    }

}
