var exec = require('cordova/exec');

exports.addMethod = function (arg0, success, error) {
    exec(success, error, 'SimpleCalculator', 'addMethod', JSON.stringify(arg0));
};

// exports.coolMethod = function (arg0, success, error) {
//     exec(success, error, 'SimpleCalculator', 'coolMethod', [arg0]);
// };
