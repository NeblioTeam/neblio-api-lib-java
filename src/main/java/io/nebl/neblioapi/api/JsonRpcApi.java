/*
 * Neblio REST API Suite
 * APIs for Interacting with NTP1 Tokens & The Neblio Blockchain
 *
 * OpenAPI spec version: 1.2.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.nebl.neblioapi.api;

import io.nebl.neblioapi.ApiCallback;
import io.nebl.neblioapi.ApiClient;
import io.nebl.neblioapi.ApiException;
import io.nebl.neblioapi.ApiResponse;
import io.nebl.neblioapi.Configuration;
import io.nebl.neblioapi.Pair;
import io.nebl.neblioapi.ProgressRequestBody;
import io.nebl.neblioapi.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.nebl.neblioapi.models.RpcRequest;
import io.nebl.neblioapi.models.RpcResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonRpcApi {
    private ApiClient localVarApiClient;

    public JsonRpcApi() {
        this(Configuration.getDefaultApiClient());
    }

    public JsonRpcApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for jsonRpc
     * @param rpcRequest  (required)
     * @param _progressListener Progress listener
     * @param _progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call jsonRpcCall(RpcRequest rpcRequest, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        Object localVarPostBody = rpcRequest;

        // create path and map variables
        String localVarPath = "/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (_progressListener != null) {
            localVarApiClient.setHttpClient(localVarApiClient.getHttpClient().newBuilder().addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), _progressListener))
                            .build();
                }
            }).build());
        }

        String[] localVarAuthNames = new String[] { "rpcAuth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call jsonRpcValidateBeforeCall(RpcRequest rpcRequest, final ProgressResponseBody.ProgressListener _progressListener, final ProgressRequestBody.ProgressRequestListener _progressRequestListener) throws ApiException {
        
        // verify the required parameter 'rpcRequest' is set
        if (rpcRequest == null) {
            throw new ApiException("Missing the required parameter 'rpcRequest' when calling jsonRpc(Async)");
        }
        

        okhttp3.Call localVarCall = jsonRpcCall(rpcRequest, _progressListener, _progressRequestListener);
        return localVarCall;

    }

    /**
     * Send a JSON-RPC call to a localhost neblio-Qt or nebliod node
     * Call any Neblio RPC command from the Neblio API libraries. Useful for signing transactions with a local node and other functions. Will not work from a browser due to CORS restrictions. Requires a node to be running locally at 127.0.0.1
     * @param rpcRequest  (required)
     * @return RpcResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RpcResponse jsonRpc(RpcRequest rpcRequest) throws ApiException {
        ApiResponse<RpcResponse> localVarResp = jsonRpcWithHttpInfo(rpcRequest);
        return localVarResp.getData();
    }

    /**
     * Send a JSON-RPC call to a localhost neblio-Qt or nebliod node
     * Call any Neblio RPC command from the Neblio API libraries. Useful for signing transactions with a local node and other functions. Will not work from a browser due to CORS restrictions. Requires a node to be running locally at 127.0.0.1
     * @param rpcRequest  (required)
     * @return ApiResponse&lt;RpcResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RpcResponse> jsonRpcWithHttpInfo(RpcRequest rpcRequest) throws ApiException {
        okhttp3.Call localVarCall = jsonRpcValidateBeforeCall(rpcRequest, null, null);
        Type localVarReturnType = new TypeToken<RpcResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Send a JSON-RPC call to a localhost neblio-Qt or nebliod node (asynchronously)
     * Call any Neblio RPC command from the Neblio API libraries. Useful for signing transactions with a local node and other functions. Will not work from a browser due to CORS restrictions. Requires a node to be running locally at 127.0.0.1
     * @param rpcRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call jsonRpcAsync(RpcRequest rpcRequest, final ApiCallback<RpcResponse> _callback) throws ApiException {

        ProgressResponseBody.ProgressListener _progressListener = null;
        ProgressRequestBody.ProgressRequestListener _progressRequestListener = null;

        if (_callback != null) {
            _progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    _callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            _progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    _callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        okhttp3.Call localVarCall = jsonRpcValidateBeforeCall(rpcRequest, _progressListener, _progressRequestListener);
        Type localVarReturnType = new TypeToken<RpcResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
