import java.util.ArrayList;

public class Mytag {

     static ArrayList <String> names = new ArrayList<>();
     static ArrayList <String> types = new ArrayList<>();
     static ArrayList <String> details = new ArrayList<>();
     DashboardAdmin lol = new DashboardAdmin();

        public Mytag(String name, String type, String detail)
        {
            names.add(name);
            types.add(type);
            details.add(detail);

            for(int i = 0; i < names.size(); ++i)
            lol.addData(names.get(i), types.get(i), details.get(i));
        }



}
