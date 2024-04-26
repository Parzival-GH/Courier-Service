package repo;


import java.util.LinkedList;
import java.util.List;

public interface CourierServiceRepo {
    List<String> listOfSender = new LinkedList<>();
    List<String> listOfAddressee = new LinkedList<>();
    List<String> listOfOrder = new LinkedList<>();
}
