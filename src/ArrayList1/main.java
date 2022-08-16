package ArrayList1;

import java.io.IOException;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<DTO> list = new ArrayList<DTO>();
        try {
            while (true) {
                list.add(new DTO());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("start");
    }
//  Chay mai khong dung
}
