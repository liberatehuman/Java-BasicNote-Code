package d09_constructor_refer_new;

@FunctionalInterface
public interface PersonBuilder {
    Person buildPerson(String name);//根据传递的名字，返回一个 Person 对象
}
