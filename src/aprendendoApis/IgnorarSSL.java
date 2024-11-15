package aprendendoApis;

import javax.net.ssl.*;

import java.net.http.HttpClient;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;

public class IgnorarSSL {
	// Método para criar um HttpClient que ignora SSL
    public static HttpClient createHttpClientIgnoringSSL() throws NoSuchAlgorithmException, KeyManagementException {
        // Configura um TrustManager que aceita todos os certificados
        TrustManager[] trustAllCerts = new TrustManager[]{
            new X509TrustManager() {
                public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                    return null;
                }
                public void checkClientTrusted(java.security.cert.X509Certificate[] certs, String authType) {}
                public void checkServerTrusted(java.security.cert.X509Certificate[] certs, String authType) {}
            }
        };

        // Cria um SSLContext que usa o TrustManager
        SSLContext sslContext = SSLContext.getInstance("TLS");
        sslContext.init(null, trustAllCerts, new java.security.SecureRandom());

        // Retorna um HttpClient configurado com o SSLContext
        return HttpClient.newBuilder()
                .sslContext(sslContext)
                .build();
    }
    
}