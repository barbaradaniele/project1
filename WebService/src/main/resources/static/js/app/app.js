var app = angular.module('crudApp',['ui.router','ngStorage']);

app.constant('urls', {
    BASE: 'http://localhost:8080/WebService',
    USER_SERVICE_API : 'http://localhost:8080/WebService/api/acessos/'
});

app.config(['$stateProvider', '$urlRouterProvider',
    function($stateProvider, $urlRouterProvider) {

        $stateProvider
            .state('home', {
                url: '/',
                templateUrl: 'partials/list',
                controller:'AcessoControllerRest',
                controllerAs:'ctrl',
                resolve: {
                    users: function ($q, AcessoService) {
                        console.log('Load all acess');
                        var deferred = $q.defer();
                        AcessoService.loadAllAcessos().then(deferred.resolve, deferred.resolve);
                        return deferred.promise;
                    }
                }
            });
        $urlRouterProvider.otherwise('/');
    }]);

