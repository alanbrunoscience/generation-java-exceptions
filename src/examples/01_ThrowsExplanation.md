## `throws`

<br />

The **`throws`** clause specifies the **exceptions that a method might throw**. It is inserted in the method's signature, after the parameter list and before the method body. The **`throws`** clause contains a comma-separated list of exception classes. These exceptions can be thrown by statements within the method body or by methods that are called inside it.

<br />

See the example below:

<br />

```java
public class TestException {

 public static void main(String[] args) throws Exception1, Exception2 {

 }

}
```

<br />

In the example above, the **`throws`** clause informs the **calling Class** that this method might throw one or more exceptions within its scope. This **forces** the calling code to either **handle that exception** (using **`try-catch`**) or **re-throw the exception** using the **`throws`** keyword in its own signature. You can include more than one exception in the **`throws`** clause in the method signature.

<br />
