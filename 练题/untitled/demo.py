import requests as re


def baidu(wd = "飞猪"):
    headers= {"User-Agent": "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) "
                            "Chrome/70.0.3538.25 Safari/537.36 Core/1.70.3704.400 QQBrowser/10.4.3587.400"}
    for i in range(1):
        pn = i * 10
        responce = re.get("https://www.baidu.com/s?wd=" + wd +"&pn=" + str(pn),headers = headers)

        print(responce.text)

query = "飞猪"
baidu(query)