INF = 9999
V = 5
sum=0
G = [[0, 9, 5, 10, 20],
     [9, 0, 45, 1, 42],
     [25, 15, 0, 34, 6],
     [10, 19, 21, 0, 31],
     [10, 32, 16, 11, 0]]
selected = [0, 0, 0, 0, 0]
no_edge = 0
selected[0] = True
print("Edge : Weight\n")
while (no_edge < V - 1):
    minimum = INF
    x = 0
    y = 0
    for i in range(V):
        if selected[i]:
            for j in range(V):
                if ((not selected[j]) and G[i][j]):  
                    if minimum > G[i][j]:
                        minimum = G[i][j]
                        x = i
                        y = j
    print(str(x) + "-" + str(y) + ":" + str(G[x][y]))
    sum+=int(G[x][y])
    selected[y] = True
    no_edge += 1
print('Total Weight:',sum)