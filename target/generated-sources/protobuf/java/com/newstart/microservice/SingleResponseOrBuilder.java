// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sms.proto

package com.newstart.microservice;

public interface SingleResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SingleResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.SingleRequest singleRequest = 1;</code>
   * @return Whether the singleRequest field is set.
   */
  boolean hasSingleRequest();
  /**
   * <code>.SingleRequest singleRequest = 1;</code>
   * @return The singleRequest.
   */
  com.newstart.microservice.SingleRequest getSingleRequest();
  /**
   * <code>.SingleRequest singleRequest = 1;</code>
   */
  com.newstart.microservice.SingleRequestOrBuilder getSingleRequestOrBuilder();

  /**
   * <code>string status = 2;</code>
   * @return The status.
   */
  java.lang.String getStatus();
  /**
   * <code>string status = 2;</code>
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString
      getStatusBytes();
}
