file = open("ratings.csv", "r")
file2 = open("titles.csv", "r")
for line in file:
    l = line.split(",")
    if (l[1]=="movie"):
        file2.write(line)