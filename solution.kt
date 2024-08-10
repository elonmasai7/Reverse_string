class Solution {
    fun reverseString(s: CharArray): Unit {
        var left = 0
        var right = s.size - 1

        while  (left < right) {
            val temp = s[left]
            s[left] = s[right]
            s[right] = temp


            left++
            right--
        }
        
    }
}

fun main() {
    val solution = Solution()

    val s1 = charArrayOf('h', 'e', '1', '1', '0')
    solution.reverseString(s1)
    println("Outpu: ${s1.joinToString(", ")}")

    val s2 = charArrayOf('H', 'a', 'n', 'a', 'h')
    solution.reverseString(s2)
    println("Output: ${s2.joinToString(", ")}")
}
