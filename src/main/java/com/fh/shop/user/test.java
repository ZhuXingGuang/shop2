package com.fh.shop.user;

public class test {

    /*public static void main(String[] args) {

        CloseableHttpClient client = HttpClientBuilder.create().build();

        HttpPost httpPost = new HttpPost("https://api.netease.im/sms/sendcode.action");

        httpPost.addHeader("AppKey","a72dd97b8042adbf2b1187532aa0b94b");

        String nonce = UUID.randomUUID().toString();

        httpPost.addHeader("Nonce", nonce);

        String curTime = "" + new Date().getTime();

        httpPost.addHeader("CurTime", curTime);

        String checkSum = CheckSumBuilder.getCheckSum("48859e7ddde0", nonce, curTime);

        httpPost.addHeader("CheckSum",checkSum);

        List<NameValuePair> list = new ArrayList<>();

        list.add(new BasicNameValuePair("mobile","18738823014"));

        list.add(new BasicNameValuePair("codeLen","6"));

        try {
            UrlEncodedFormEntity params = new UrlEncodedFormEntity(list,"utf-8");

            httpPost.setEntity(params);

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        CloseableHttpResponse execute = null;

        try {
            execute = client.execute(httpPost);

            HttpEntity entity = execute.getEntity();

            String result = EntityUtils.toString(entity,"utf-8");

            System.out.println(result);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            if(null != execute){
                try {
                    execute.close();
                    execute = null;
                } catch (IOException e) {
                    e.printStackTrace();
                }

                if(null != httpPost){
                    httpPost.releaseConnection();
                    httpPost = null;
                }

                if(null != client){
                    try {
                        client.close();
                        client = null;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }*/

    public static void main(String[] args) {

        //String result = SendSms.se("18738823014");

       // System.out.println(result);
    }



}
