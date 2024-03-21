module.exports = {
    "env": {
        "es2021": true,
        "node": true
    },
    "extends": "standard-with-typescript",
    "overrides": [
        {
            "env": {
                "node": true
            },
            "files": [
                ".eslintrc.{js,cjs}"
            ],
            "parserOptions": {
                "sourceType": "script"
            }
        }
    ],
    "parserOptions": {
        "ecmaVersion": "latest",
        "sourceType": "module"
    },
    "rules": {
        "prettier/prettier":"error",
        "class-methods-use-this":"off",
        "no-param-reassign":"off",
        "camelcase":"off",
        "no-underscore-dangle":"off",
        "no-unused-vars": ["error", {"argsIgnorePattern":"next"} ]
    }
}
