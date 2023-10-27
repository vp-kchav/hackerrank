package threads.future;

import java.util.concurrent.CompletableFuture;

public class CompleteableFuture {

    public static void main(String[] args) throws Exception
    {
        CompletableFuture<String> helloFuture
                = CompletableFuture.supplyAsync(() -> "Hello");
        CompletableFuture<String> greetingFuture
                = CompletableFuture.supplyAsync(() -> "World");

        CompletableFuture<String> combinedFuture
                = helloFuture.thenCombine(
                greetingFuture, (m1, m2) -> m1 + " " + m2);

        System.out.println(combinedFuture.get());
    }
}
