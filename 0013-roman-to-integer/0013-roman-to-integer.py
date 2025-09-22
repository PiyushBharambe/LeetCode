class Solution:
    def romanToInt(self, s: str) -> int:
        roman_dict = {"I": 1, "V": 5, "X": 10, "L": 50, "C": 100, "D": 500, "M": 1000}

        count = 0
        for i in range(len(s)):
            value = roman_dict[s[i]]

            
            if i + 1 < len(s) and roman_dict[s[i + 1]] > value:
                count -= value
            else:
                count += value

        return count

sol = Solution()
print(sol.romanToInt("III"))  
