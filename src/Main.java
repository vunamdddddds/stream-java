import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        List<Integer > list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        List<String> list1=new ArrayList<>();
        list1.add("nam");
        list1.add("vu");

        List<Integer>mapping=list1.stream().map(String::length).collect(Collectors.toList());
        double avg=list.stream().mapToInt(i->i).average().getAsDouble();
int maxvalue=list.stream().mapToInt(i->i).max().getAsInt();
int minvalue=list.stream().mapToInt(i->i).min().getAsInt();
List<Integer> sochan=list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
List<Integer> dictint=list.stream().distinct().collect(Collectors.toList());
System.out.println("Mapping:"+mapping);
System.out.println("Dictint:"+dictint);
System.out.println("max:"+maxvalue);
System.out.println("min:"+minvalue);
System.out.println("avarage:"+avg);
System.out.println("sochan:"+sochan);

        }
    }
