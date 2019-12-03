class Day2Test extends org.scalatest.FunSuite {

    test("Given test cases") {
        assert(Day2.task1(Array(1,0,0,0,99)) === Array(2,0,0,0,99))
        assert(Day2.task1(Array(2,3,0,3,99)) === Array(2,3,0,6,99))
        assert(Day2.task1(Array(2,4,4,5,99,0)) === Array(2,4,4,5,99,9801))
        assert(Day2.task1(Array(1,1,1,4,99,5,6,0,99)) === Array(30,1,1,4,2,5,6,0,99))
    }

}
