//Arithmetic operators
// Normal arithmetic operators
assert 1 + 2 == 3
assert 4 - 3 == 1
assert 3 * 5 == 15
assert 3 / 2 == 1.5
assert 10 % 3 == 1
assert 2 ** 3 == 8
assert 9.intdiv(5) == 1

assert 2.2.plus(1.1) == 3.3

//Unary operators
assert +3 == 3
assert -4 == 0 - 4
assert -(-1) == 1

//Increment and decrement operators
def a = 2
def b = a++ * 3
assert a == 3 && b == 6

def c = 3
def d = c-- * 2

assert c == 2 && d == 6

//Bitwise operators
int z = 20
int y = 25
println (z & y)

println Integer.toBinaryString(20) //10100
println Integer.toBinaryString(25) //11001
                                     //10000

println Integer.parseInt("10100", 2)

//Conditional operators
assert (!true) == false
assert (!'foo') == false
assert (!'')    == true

//ternary operator
def output1 = (1>0) ? "1 is greater" : "1 is not greater" //if true primera opcion
println output1


