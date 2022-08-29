file = open("ratings.csv", "r")
file2 = open("titles.csv", "r")
file3 = open("data.csv", "w")
#Combine ratings and titles files into data with rating somewhere on each line and number of votes too
l = 0
for line in file2:
    movie = line.split(",")
    rating = 0
    num = 0
    ll = 0
    for l2 in file[l:]:
        rate = l2.split(",")
        ll+=1
        if rate[0]==movie[0]:
            l = ll
