# -com.javarush.task.task09.task0901
Возвращаем StackTrace

Написать пять методов, которые вызывают друг друга.
Каждый метод должен возвращать свой StackTrace.
Требования:

    •
    В классе должно быть 5 методов (метод main не учитывать).
    •
    Каждый метод должен вызывать следующий: main вызывать method1, method1 вызывать method2 и т.д.
    •
    Каждый метод должен возвращать свой StackTrace.
    •
    Для получения StackTrace воспользуйся Thread.currentThread().getStackTrace().
