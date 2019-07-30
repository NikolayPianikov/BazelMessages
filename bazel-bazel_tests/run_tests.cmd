bazel clean
bazel test --flaky_test_attempts=2 -- :tests