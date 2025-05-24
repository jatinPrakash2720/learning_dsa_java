
# def kadan_algo(arr):
#     cs=0
#     ms = float('-inf')
#     for num in arr:
#         cs=cs+num
#         if cs<0:
#             cs=0
#         ms =max(ms,cs)
#     return ms


# print(kadan_algo([-2,-3,4,-1,-2,1,5,-2]))

def kadan_algo(arr):
    ms = float('-inf')
    cs = 0
    for num in arr:
        cs = cs+num
        if cs<0:
            cs=0
        ms=max(ms,cs)
    return ms

arr=[-2,-3,4,-1,-2,1,5,-3]
print(kadan_algo(arr))