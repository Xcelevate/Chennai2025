package stream.question;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] kk) {
        User usr = new User();
        List<User> users = usr.getUsers();

//        for (User user : mainList)
//            System.out.println(user.getId() + "  " + user.getName() + "  ---> products : " ); + user.getProduct());

//        mainList.forEach(u -> {
//            System.out.println("userId : " + u.getId() + " |  username : " + u.getName());
//            System.out.println("product Id : " + u.getProduct().getId() +
//                    "  | product name : " + u.getProduct().getName() +
//                    "  | product price : " + u.getProduct().getPrice() +
//                    "  | product weight : " + u.getProduct().getWeight());
//            System.out.println();
//        });
        Map<String, List<Product>> categoryToProducts =
                users.stream()
                        .map(User::getProduct)
                        .collect(Collectors.groupingBy(
                                Product::getCategory
                        ));
       // Map<String , List<User>> list = users.stream().map(User::getProduct).collect()
        for(String str : categoryToProducts.keySet()){
            System.out.println(str + "  ---> "  + categoryToProducts.get(str));
        }
    }
}
