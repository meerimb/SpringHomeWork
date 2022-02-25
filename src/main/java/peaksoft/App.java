package peaksoft;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import peaksoft.model.Cat;
import peaksoft.model.Dog;
import peaksoft.model.Friend;
import peaksoft.model.Person;
/**
 * 1. Maven проект тузунуз (dependency spring context кошуп)
 * 2. Animal деген интерфейс тузуп, анын animalPlus жана animalMinus деген методдору болуш керек.
 * 3. Сиз кайсы жаныбарды жакшы корсонуз, ошого жараша класс тузуп,  свойствасына породасын, тусун ж.б.у.с. кошсонуз болот.
 *    Сиз тузгон класс Animal интерфейсин реализация кылыш керек.
 * 4. Person деген класс тузуп, свойствасына animal, name, age бериниз.
 * 5. Main'ден spring колдонуп озунуздун жана жакын бир адамыныздын жакшы коргон жаныбарын консольго чыгарыныз
 * PS: bean'дер тузулуш керек жана маалыматтар application.properties файлга жазылыш керек.
 */
public class App 
{
    public static void main( String[] args ) {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Dog dog=context.getBean("dogId",Dog.class);
        System.out.println(dog);
        dog.animalMinus();

        Cat cat=context.getBean("catId",Cat.class);
        System.out.println(cat);
        cat.animalPlus();

        Person person=context.getBean("personId",Person.class);
        System.out.println(person);

        Friend friend=context.getBean("friendId",Friend.class);
        System.out.println(friend);


    }
}
