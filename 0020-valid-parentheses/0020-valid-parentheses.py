class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        pairs = {')': '(', '}': '{', ']': '['}

        for char in s:
            if char in pairs.values():
                stack.append(char)
            else:
                if not stack or pairs[char] != stack.pop():
                    return False

        return not stack
