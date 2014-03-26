public class MedianofTwoSortedArrays {

	public double findMedianSortedArrays(int A[], int B[]) {
		if (A.length == 0) {
			if (B.length % 2 == 0)
				return (double) (B[B.length / 2 - 1] + B[B.length / 2]) / 2;
			else
				return (double) (B[B.length / 2]);
		} else if (B.length == 0) {
			if (A.length % 2 == 0)
				return (double) (A[A.length / 2 - 1] + A[A.length / 2]) / 2;
			else
				return (double) (A[A.length / 2]);
		} else if (A.length == 1 && B.length == 1) {
			return (double) (A[0] + B[0]) / 2;
		} else if (A.length == 1) {
			if ((B.length + 1) % 2 == 0) {
				if (A[0] <= B[B.length / 2 - 1])
					return (double) (B[B.length / 2 - 1] + B[B.length / 2]) / 2;
				else if (A[0] >= B[B.length / 2 - 1]
						&& A[0] <= B[B.length / 2 + 1])
					return (double) (A[0] + B[B.length / 2]) / 2;
				else
					return (double) (B[B.length / 2 + 1] + B[B.length / 2]) / 2;
			} else {
				if (A[0] <= B[B.length / 2 - 1])
					return (double) B[B.length / 2 - 1];
				else if (A[0] >= B[B.length / 2])
					return (double) B[B.length / 2];
				else
					return (double) A[0];
			}
		} else if (B.length == 1) {
			if ((A.length + 1) % 2 == 0) {
				if (B[0] <= A[A.length / 2 - 1])
					return (double) (A[A.length / 2 - 1] + A[A.length / 2]) / 2;
				else if (B[0] >= A[A.length / 2 - 1]
						&& B[0] <= A[A.length / 2 + 1])
					return (double) (B[0] + A[A.length / 2]) / 2;
				else
					return (double) (A[A.length / 2 + 1] + A[A.length / 2]) / 2;
			} else {
				if (B[0] <= A[A.length / 2 - 1])
					return (double) A[A.length / 2 - 1];
				else if (B[0] >= A[A.length / 2])
					return (double) A[A.length / 2];
				else
					return (double) B[0];
			}
		}

		return findMedian(A, 0, A.length - 1, B, 0, B.length - 1);

	}

	public double findMedian(int A[], int as, int ae, int B[], int bs, int be) {

		int oddOrEven = (A.length + B.length) % 2;

		if (ae - as == 1 && be - bs == 1) {
			if (A[ae] <= B[bs]
					|| (A[ae] < B[be] && A[ae] > B[bs] && A[as] <= B[bs]))
				return (double) (A[ae] + B[bs]) / 2;
			else if (A[ae] >= B[be] && A[as] <= B[bs])
				return (double) (B[bs] + B[be]) / 2;
			else if (A[as] >= B[bs] && A[ae] <= B[be])
				return (double) (A[as] + A[ae]) / 2;
			else if ((A[as] >= B[bs] && A[as] <= B[be] && A[ae] >= B[be])
					|| A[as] >= B[be])
				return (double) (A[as] + B[be]) / 2;

		}

		if (ae - as == 1) {
			// 奇数
			if (oddOrEven == 1) {
				if (A[as] >= B[(be + bs) / 2 + 1])
					return B[(be + bs) / 2 + 1];
				else if (A[ae] <= B[(be + bs) / 2 - 1])
					return B[(be + bs) / 2 - 1];
				else if (A[ae] <= B[(be + bs) / 2])
					return A[ae];
				else if (A[ae] <= B[(be + bs) / 2 + 1]
						&& A[as] <= B[(be + bs) / 2])
					return B[(be + bs) / 2];
				else if (A[ae] <= B[(be + bs) / 2 + 1]
						&& A[as] >= B[(be + bs) / 2])
					return A[as];
				else if (A[ae] >= B[(be + bs) / 2 + 1]
						&& A[as] <= B[(be + bs) / 2])
					return B[(be + bs) / 2];
				// else if(A[ae]>=B[(be-bs)/2+1]&&A[as]>=B[(be-bs)/2])return A[as];
				else
					return A[as];
			}
			// 偶数
			else {
				if (A[as] >= B[(be + bs) / 2 + 2])
					return (double) (B[(be + bs) / 2 + 1] + B[(be + bs) / 2 + 2]) / 2;
				else if (A[ae] <= B[(be + bs) / 2 - 1])
					return (double) (B[(be + bs) / 2] + B[(be + bs) / 2 - 1]) / 2;
				else if (A[ae] <= B[(be + bs) / 2])
					return (double) (B[(be + bs) / 2] + A[ae]) / 2;
				else if (A[ae] <= B[(be + bs) / 2 + 1]
						&& A[as] <= B[(be + bs) / 2])
					return (double) (B[(be + bs) / 2] + A[ae]) / 2;
				else if (A[ae] <= B[(be + bs) / 2 + 1]
						&& A[as] >= B[(be + bs) / 2])
					return (double) (A[as] + A[ae]) / 2;
				else if (A[ae] <= B[(be + bs) / 2 + 2]
						&& A[as] <= B[(be + bs) / 2])
					return (double) (B[(be + bs) / 2] + B[(be + bs) / 2 + 1]) / 2;
				else if (A[ae] <= B[(be + bs) / 2 + 2])
					return (double) (A[as] + B[(be + bs) / 2 + 1]) / 2;
				else if (A[ae] >= B[(be + bs) / 2 + 2]
						&& A[as] <= B[(be + bs) / 2])
					return (double) (B[(be + bs) / 2] + B[(be + bs) / 2 + 1]) / 2;
				// else if(A[ae]>=B[(be+bs)/2+2]&&A[as]<=B[(be+bs)/2+2])return (double)(B[(be+bs)/2]+B[(be+bs)/2+1])/2;
				else
					return (double) (A[as] + B[(be + bs) / 2 + 1]) / 2;
			}

		} else if (be - bs == 1) {
			// 奇数
			if (oddOrEven == 1) {
				if (B[bs] >= A[(ae + as) / 2 + 1])
					return A[(ae + as) / 2 + 1];
				else if (B[be] <= A[(ae + as) / 2 - 1])
					return A[(ae + as) / 2 - 1];
				else if (B[be] <= A[(ae + as) / 2])
					return B[be];
				else if (B[be] <= A[(ae + as) / 2 + 1]
						&& B[bs] <= A[(ae + as) / 2])
					return A[(ae + as) / 2];
				else if (B[be] <= A[(ae + as) / 2 + 1]
						&& B[bs] >= A[(ae + as) / 2])
					return B[bs];
				else if (B[be] >= A[(ae + as) / 2 + 1]
						&& B[bs] <= A[(ae + as) / 2])
					return A[(ae + as) / 2];
				// else if(B[be]>=A[(ae-as)/2+1]&&B[bs]>=A[(ae-as)/2])return
				// B[bs];
				else
					return B[bs];
			}
			// 偶数
			else {
				if (B[bs] >= A[(ae + as) / 2 + 2])
					return (double) (A[(ae + as) / 2 + 1] + A[(ae + as) / 2 + 2]) / 2;
				else if (B[be] <= A[(ae + as) / 2 - 1])
					return (double) (A[(ae + as) / 2] + A[(ae + as) / 2 - 1]) / 2;
				else if (B[be] <= A[(ae + as) / 2])
					return (double) (A[(ae + as) / 2] + B[be]) / 2;
				else if (B[be] <= A[(ae + as) / 2 + 1]
						&& B[bs] <= A[(ae + as) / 2])
					return (double) (A[(ae + as) / 2] + B[be]) / 2;
				else if (B[be] <= A[(ae + as) / 2 + 1]
						&& B[bs] >= A[(ae + as) / 2])
					return (double) (B[bs] + B[be]) / 2;
				else if (B[be] <= A[(ae + as) / 2 + 2]
						&& B[bs] <= A[(ae + as) / 2])
					return (double) (A[(ae + as) / 2] + A[(ae + as) / 2 + 1]) / 2;
				else if (B[be] <= A[(ae + as) / 2 + 2])
					return (double) (B[bs] + A[(ae + as) / 2 + 1]) / 2;
				else if (B[be] >= A[(ae + as) / 2 + 2]
						&& B[bs] <= A[(ae + as) / 2])
					return (double) (A[(ae + as) / 2] + A[(ae + as) / 2 + 1]) / 2;
				// else if(B[be]>=A[(ae+as)/2+2]&&B[bs]<=A[(ae+as)/2+2])return (double)(A[(ae+as)/2]+A[(ae+as)/2+1])/2;
				else
					return (double) (B[bs] + A[(ae + as) / 2 + 1]) / 2;
			}
		}

		else {

			if (A[(as + ae) / 2] >= B[(bs + be) / 2]) {

				if ((ae - as + 1) % 2 == 1) {
					if ((ae - (as + ae) / 2) >= ((bs + be) / 2 - bs)) {
						ae = ae - ((bs + be) / 2 - bs);
						bs = (bs + be) / 2;
					} else {
						bs = bs + (ae - (as + ae) / 2);
						ae = (as + ae) / 2;
					}

				} else {
					if ((ae - (as + ae) / 2 - 1) >= ((bs + be) / 2 - bs)) {
						ae = ae - ((bs + be) / 2 - bs);
						bs = (bs + be) / 2;
					} else {
						bs = bs + (ae - (as + ae) / 2 - 1);
						ae = (as + ae) / 2 + 1;
					}

				}

			} else {
				if ((be - bs + 1) % 2 == 1) {
					if ((be - (bs + be) / 2) >= ((as + ae) / 2 - as)) {
						be = be - ((as + ae) / 2 - as);
						as = (as + ae) / 2;
					} else {
						as = as + (be - (bs + be) / 2);
						be = (bs + be) / 2;
					}

				} else {
					if ((be - (bs + be) / 2 - 1) >= ((as + ae) / 2 - as)) {
						be = be - ((as + ae) / 2 - as);
						as = (as + ae) / 2;
					} else {
						as = as + (be - (bs + be) / 2 - 1);
						be = (bs + be) / 2 + 1;
					}

				}

			}
			return findMedian(A, as, ae, B, bs, be);
		}

	}

	public static void main(String[] args) {
		MedianofTwoSortedArrays test = new MedianofTwoSortedArrays();
		int A[] = { 1, 2, 6, 7 };
		int B[] = { 3, 4, 5, 8 };
		double result = test.findMedianSortedArrays(A, B);
		System.out.println(result);

	}

}
