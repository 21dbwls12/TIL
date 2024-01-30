fun main() {
    val runtime = Runtime.getRuntime()

    // Garbage collector를 호출하여 사용하지 않는 메모리를 정리
    runtime.gc()

    // 시작 시간 측정
    val startTime = System.currentTimeMillis()

    // 시작 시 메모리 측정
    val startMemory = runtime.totalMemory() - runtime.freeMemory()

    // 함수 호출
    print(function(input))

    // 종료 시 메모리 측정
    val endMemory = runtime.totalMemory() - runtime.freeMemory()

    // 종료 시간 측정
    val endTime = System.currentTimeMillis()

    // 사용한 메모리와 시간 출력
    println("\nUsed memory is ${(endMemory - startMemory) / 1024}KB")
    println("Used time is ${endTime - startTime}ms")
}
