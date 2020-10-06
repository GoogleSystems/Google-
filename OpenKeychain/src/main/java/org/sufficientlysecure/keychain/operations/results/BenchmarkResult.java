/*
 * Copyright (C) 2017 Schürmann & Breitmoser GbR
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.sufficientlysecure.keychain.operations.results;

import android.os.Parcel;


public class BenchmarkResult extends OperationResult {

    public BenchmarkResult(int result, OperationLog log) {
        super(result, log);
    }

    /** Construct from a parcel - trivial because we have no extra data. */
    public BenchmarkResult(Parcel source) {
        super(source);
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
    }

    public static final Creator<BenchmarkResult> CREATOR = new Creator<BenchmarkResult>() {
        public BenchmarkResult createFromParcel(final Parcel source) {
            return new BenchmarkResult(source);
        }

        public BenchmarkResult[] newArray(final int size) {
            return new BenchmarkResult[size];
        }
    };

}
