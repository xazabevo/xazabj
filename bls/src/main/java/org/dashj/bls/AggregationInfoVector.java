/*
 * Copyright 2018 Dash Core Group
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * This file was generated by SWIG (http://www.swig.org) and modified.
 * Version 3.0.12
 */

package org.dashj.bls;


import com.google.common.base.Preconditions;

public class AggregationInfoVector extends java.util.AbstractList<AggregationInfo> {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected AggregationInfoVector(long cPtr, boolean cMemoryOwn) {
    Preconditions.checkArgument(cPtr != 0);
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AggregationInfoVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        JNI.delete_AggregationInfoVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public AggregationInfoVector(java.util.Collection<AggregationInfo> e) {
    Preconditions.checkNotNull(e);
    this.reserve(e.size());
    for(AggregationInfo value: e) {
      this.push_back(value);
    }
  }

  public AggregationInfoVector() {
    this(JNI.new_AggregationInfoVector__SWIG_0(), true);
  }

  public AggregationInfoVector(AggregationInfoVector o) {
    this(JNI.new_AggregationInfoVector__SWIG_2(AggregationInfoVector.getCPtr(o), o), true);
  }

  public long capacity() {
    return JNI.AggregationInfoVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    JNI.AggregationInfoVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return JNI.AggregationInfoVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    JNI.AggregationInfoVector_clear(swigCPtr, this);
  }

  public void push_back(AggregationInfo x) {
    Preconditions.checkNotNull(x);
    JNI.AggregationInfoVector_push_back(swigCPtr, this, AggregationInfo.getCPtr(x), x);
  }

  public AggregationInfo get(int i) {
    return new AggregationInfo(JNI.AggregationInfoVector_get(swigCPtr, this, i), false);
  }

  public AggregationInfo set(int i, AggregationInfo VECTOR_VALUE_IN) {
    Preconditions.checkNotNull(VECTOR_VALUE_IN);
    return new AggregationInfo(JNI.AggregationInfoVector_set(swigCPtr, this, i, AggregationInfo.getCPtr(VECTOR_VALUE_IN), VECTOR_VALUE_IN), true);
  }

  public int size() {
    return JNI.AggregationInfoVector_size(swigCPtr, this);
  }

  public void removeRange(int from, int to) {
    JNI.AggregationInfoVector_removeRange(swigCPtr, this, from, to);
  }

}
